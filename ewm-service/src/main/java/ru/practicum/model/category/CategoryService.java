package ru.practicum.model.category;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import ru.practicum.model.category.categoryDto.CategoryDto;
import ru.practicum.model.category.categoryDto.NewCategoryDto;

import java.util.List;

public interface CategoryService {
    @Transactional
    CategoryDto addCategory(NewCategoryDto newCategoryDto);

    @Transactional
    void deleteCategory(Long id);

    @Transactional
    CategoryDto updateCategory(Long id, String newName);

    List<CategoryDto> getAllCategory(Integer from, Integer size);

    CategoryDto getCategoryById(@PathVariable Long catId);
}
