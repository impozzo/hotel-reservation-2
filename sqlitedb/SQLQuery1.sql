SELECT Guest.FirstName, Guest.LastName, Room.RoomNumber, Room.BasePrice, Room.RoomType, 
Reservation.DaysStay, Reservation.StartDate, Reservation.DateCreated, Reservation.PaidStatus, Reservation.ReservationStatus, 
Reservation.TotalCost, Reservation.ConfirmStatus
FROM Reservation INNER JOIN Room ON Reservation.RoomID = Room.RoomID INNER JOIN Guest ON Reservation.GuestID = Guest.GuestID