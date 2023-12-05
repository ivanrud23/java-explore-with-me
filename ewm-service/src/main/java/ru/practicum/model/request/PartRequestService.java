package ru.practicum.model.request;

import org.springframework.transaction.annotation.Transactional;
import ru.practicum.model.request.requestDto.EventRequestStatusUpdateResult;
import ru.practicum.model.request.requestDto.PartRequestUpdateDto;
import ru.practicum.model.request.requestDto.ParticipationRequestDto;

import java.util.List;

public interface PartRequestService {

    List<ParticipationRequestDto> getPartRequest(Long userId);

    @Transactional
    ParticipationRequestDto addPartRequest(Long userId, Long eventId);

    @Transactional
    ParticipationRequestDto cancelPartRequest(Long userId, Long requestId);

    List<ParticipationRequestDto> getPartRequestByUserAndEvent(Long userId, Long eventId);

    @Transactional
    EventRequestStatusUpdateResult updatePartRequest(Long userId, Long eventId, PartRequestUpdateDto userRequest);
}
