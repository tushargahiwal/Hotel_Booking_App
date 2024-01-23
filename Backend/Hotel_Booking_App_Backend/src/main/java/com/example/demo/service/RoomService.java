package com.example.demo.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Room;
import com.example.demo.repositories.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomService implements IRoomService
{
    private RoomRepository roomRepository;
	
	
	@Override
	public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) {
		Room room=new Room();
		room.setRoomType(roomType);
		room.setRoomPrice(roomPrice);
		if(!file.isEmpty())
		{
			byte[] photoBytes = null;
			try 
			{
				photoBytes = file.getBytes();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Blob photoBlob = null;
			try 
			{
				photoBlob = new SerialBlob(photoBytes);
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			room.setPhoto(photoBlob);
		}
		
		return roomRepository.save(room);
	}

}
