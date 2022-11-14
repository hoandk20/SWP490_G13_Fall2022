package com.G13.model;

import lombok.Data;

@Data
public class UserChangePassword{
      String email;
      String oldPassword;
      String newPassword;
}
