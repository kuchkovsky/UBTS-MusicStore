package ua.org.ubts.songs.converter;

import ua.org.ubts.songs.dto.BaseDto;
import ua.org.ubts.songs.entity.BaseEntity;

import java.util.List;
import java.util.stream.Collectors;

public interface GenericConverter<D extends BaseDto, E extends BaseEntity> {

    E convertToEntity(D dto);

    D convertToDto(E entity);

    default List<D> convertToDto(List<E> entities) {
        return entities.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    default List<E> convertToEntity(List<D> dtos) {
        return dtos.stream().map(this::convertToEntity).collect(Collectors.toList());
    }

}
