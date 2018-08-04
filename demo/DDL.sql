CREATE TABLE User (
	id int not null generated always as userId (start with 1 increment by), 
	name varchar(10) not null, 
	contact_no varchar(11) not null,
	email varchar(30) not null, 
	primary key (userId)
);

CREATE TABLE Theater (
	id int not null generated always as theaterId (start with 100 increment by 1), 
	theaterName varchar(10) not null,
	address varchar(30) not null,
	primary key(theaterId)
);

CREATE TABLE Movie (
	id int not null generated always as movieId (start with 1000 increment by 1), 
	num int not null, 
	movieName varchar(30) not null,
	language varchar(10) not null,
	primary key (movieId),
	foreign key (num) 
		references Theater(theaterId) 
		on update restrict on delete cascade -- if movie is deleted from Theater table,
						-- cascades that action in Movie table
);

CREATE TABLE ShowTime (
	sdate date not null primary key ,
	MovieId int,
	FOREIGN KEY (MovieId) REFERENCES Movie(MovieId)
);

CREATE TABLE Booking (
	Bookingdate date not null primary key ,
	NoOfSeats int,
	MovieId int,
    FOREIGN KEY (MovieId) REFERENCES Movie(MovieId)
);
