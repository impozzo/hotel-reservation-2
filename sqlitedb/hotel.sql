BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Hotel" (
	"RoomID"	INTEGER NOT NULL UNIQUE,
	"RoomNumber"	INTEGER NOT NULL UNIQUE,
	"BasePrice"	INTEGER NOT NULL,
	"RoomType"	TEXT NOT NULL,
	PRIMARY KEY("RoomID" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Guest" (
	"GuestID"	INTEGER NOT NULL UNIQUE,
	"FirstName"	TEXT NOT NULL,
	"LastName"	TEXT NOT NULL,
	"Email"	TEXT NOT NULL,
	PRIMARY KEY("GuestID" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Reservation" (
	"ResrvationID"	INTEGER NOT NULL UNIQUE,
	"GuestID"	INTEGER NOT NULL,
	"RoomID"	INTEGER NOT NULL,
	"DaysStay"	INTEGER NOT NULL DEFAULT 1,
	"StartDate"	TEXT NOT NULL,
	"DateCreated"	TEXT NOT NULL,
	"PaidStatus"	TEXT NOT NULL,
	"ReservationStatus"	TEXT NOT NULL,
	"ConfirmStatus"	INTEGER NOT NULL,
	"TotalCost"	NUMERIC NOT NULL,
	PRIMARY KEY("ResrvationID" AUTOINCREMENT)
);
COMMIT;
