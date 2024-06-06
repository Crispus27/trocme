package com.crispus.trocme.dto;

import org.modelmapper.ModelMapper;

import com.crispus.trocme.models.Notification;

public class NotificationDto {
public static NotificationDto fromEntity(Notification notification){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(notification, NotificationDto.class);
    }

    public static Notification toEntity(NotificationDto notificationDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(notificationDto, Notification.class);
    }
}
