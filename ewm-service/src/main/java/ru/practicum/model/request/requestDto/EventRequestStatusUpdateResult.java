package ru.practicum.model.request.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequestStatusUpdateResult {

    List<ParticipationRequestDto> confirmedRequests;

    List<ParticipationRequestDto> rejectedRequests;

}
