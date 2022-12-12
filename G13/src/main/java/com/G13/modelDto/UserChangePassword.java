package com.G13.modelDto;

import lombok.Data;

@Data
public class UserChangePassword{
      String email;
      String oldPassword;
      String newPassword;
}
