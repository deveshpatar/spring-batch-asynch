package com.devesh.batch.service;

import java.util.List;

import com.devesh.batch.dto.NotificationDto;

public interface NotificationAsyncService {

	void sendNotification(List<NotificationDto> sendNotification);

}
