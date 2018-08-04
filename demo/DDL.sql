create DATABASE TicketBooking

CREATE TABLE User (
	userId int not null AUTO_INCREMENT, 
	name varchar(10) not null, 
	contact_no varchar(11) not null,
	email varchar(30) not null, 
	isAdmin boolean not null,
	primary key (userId)
);

CREATE TABLE Theater (
	theaterId int not null AUTO_INCREMENT, 
	theaterName varchar(10) not null,
	address varchar(30) not null,
	num_seats int not null,
	primary key(theaterId)
);

CREATE TABLE Movie (
	movieId int not null AUTO_INCREMENT, 
	theaterId int not null, 
	movieName varchar(30) not null,
	language varchar(10) not null,
	primary key (movieId),
	foreign key (theaterId) 
		references Theater(theaterId) 
		on delete cascade -- if movie is deleted from Theater table,
											 -- cascades that action in Movie table
);

CREATE TABLE ShowTime (
	showtimeId int not null primary key,
	showtimeDate date not null,
	movieId int not null,
	theaterId int not  null,
	FOREIGN KEY (movieId) REFERENCES Movie(movieId),
	FOREIGN KEY (theaterId) REFERENCES Theater(theaterId)
);

CREATE TABLE Booking (
	bookingId not null primary key,
	bookingDate date not null,
	userId int not null,
	numSeatsBooked int not null,
	movieId int not null,
	-- theaterId int not null,
	FOREIGN KEY (userId) references User(userId),
    FOREIGN KEY (movieId) REFERENCES Movie(movieId)
	-- FOREIGN KEY (TheaterId) REFERENCES Theater(TheaterId)
);
