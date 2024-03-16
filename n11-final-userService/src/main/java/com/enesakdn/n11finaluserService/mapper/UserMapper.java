package com.enesakdn.n11finaluserService.mapper;

import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User convertToUser(UserSaveRequest request);

    UserDTO convertToUserDTO(User user);

    List<UserDTO> convertToUserDTOs(List<User> user);

    @Mapping(target = "id", ignore = true)
    void updateUserFields(@MappingTarget User user, UserUpdateRequest request);
/*
Bu metodun amacı, User nesnesinin belirli alanlarını güncellemek için kullanılır.
 Ancak, id alanı güncelleme işlemi sırasında dikkate alınmaz ve kopyalanmaz.
  Bu metodun çağrılması, müşteri nesnesinin belirli alanlarını,
 UserUpdateRequest nesnesindeki verilere göre güncellemeyi sağlar. */
}
