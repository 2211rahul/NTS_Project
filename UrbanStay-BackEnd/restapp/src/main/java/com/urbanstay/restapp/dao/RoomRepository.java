package com.urbanstay.restapp.dao;

import com.urbanstay.restapp.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {

}
