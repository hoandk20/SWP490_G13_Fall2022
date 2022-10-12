package com.G13.repo;

import com.G13.domain.TnCalendar;
import com.G13.domain.TnCalendarId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TnCalendarRepository extends JpaRepository<TnCalendar, TnCalendarId> {
}