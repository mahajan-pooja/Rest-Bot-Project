-- User endpoint queries 
SELECT * FROM USERS 
SELECT * FROM USERS WHERE userId = ? 
INSERT INTO USERS VALUES (name, contact_no, email, isAdmin) VALUES (?, ? , ?, ?)
DELETE FROM USERS WHERE userId = ? 
UPDATE USER SET name = ?, contact_no = ?, email =?, isAdmin = ? where userId = ?

-- TheaterController 
SELECT * FROM THEATER
INSERT INTO THEATER VALUES (theaterName, address, num_seats) VALUES (?, ? ,?)
DELETE FROM THEATER WHERE theaterId = ? 
UPDATE THEATER SET theaterName = ?, address = ?, num_seats = ? where theaterId = ?

-- Movie Controller
SELECT * FROM Movie
SELECT * from Movie WHERE theaterId = ?
SELECT * FROM movie WHERE theaterId = ? AND movieId = ?
INSERT INTO MOVIE VALUES (theaterId, movieName, language) VALUES (?, ?, ?)
DELETE FROM MOVIE WHERE movieId = ?
UPDATE MOVIE SET theaterId = ?, movieName = ?, language = ? VALUES (?, ?, ?)

-- Booking Controller
SELECT * FROM BOOKING WHERE userId = ? -- this returns only cusotmer's bookings, admin only
SELECT * FROM BOOKING WHERE userId = ? and bookingId = ? -- for user use to see their bookings
DELETE FROM BOOKING WHERE bookingId = ?
INSERT INTO BOOKING VALUES (bookingDate, userId, numSeatsBooked, movieId, showtimeId)
	VALUES (?, ?, ?, ?, ?)
