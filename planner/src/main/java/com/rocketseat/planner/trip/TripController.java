package com.rocketseat.planner.trip;

import com.rocketseat.planner.participant.ParticipantService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ParticipantService participantService;

    @Autowired
    private TripRespository tripRespository;

    @PostMapping
    public ResponseEntity<TripCreateResponse> createTrip(@RequestBody TripRequestPayLoad payLoad){
        Trip newTrip = new Trip(payLoad);

        this.tripRespository.save(newTrip);
        this.participantService.registerParticipantToEvent(payLoad.emails_to_invite(), newTrip.getId());
        return ResponseEntity.ok(new TripCreateResponse(newTrip.getId()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trip> getTripDetails(@PathVariable UUID id){

        Optional<Trip> trip = this.tripRespository.findById(id);

        return trip.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
