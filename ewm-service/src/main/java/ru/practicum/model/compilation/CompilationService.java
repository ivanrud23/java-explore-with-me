package ru.practicum.model.compilation;

import org.springframework.transaction.annotation.Transactional;
import ru.practicum.model.compilation.compilationDto.CompilationDto;
import ru.practicum.model.compilation.compilationDto.NewCompilationDto;
import ru.practicum.model.compilation.compilationDto.UpdateCompilationDto;

import java.util.List;

public interface CompilationService {
    @Transactional
    CompilationDto addCompilation(NewCompilationDto newCompilationDto);

    CompilationDto getCompilationById(Long compId);

    List<CompilationDto> getCompilationByParam(Boolean pinned, Integer from, Integer size);

    void deleteCompilation(Long compId);

    @Transactional
    CompilationDto updateCompilation(Long compId, UpdateCompilationDto newCompilationDto);
}
