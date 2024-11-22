create database Java_TV_Phim
go
use Java_TV_Phim

CREATE TABLE Directors
(
	IdDirector INT PRIMARY KEY IDENTITY(1,1),
	NameDirector NVARCHAR(100) not null,
	DirectImgURL NVARCHAR(2083) NOT NULL
);

insert into Directors values
	('Christopher Nolan','C:\Java\FinalPresent\src\main\java\Icon\Christopher-Nolan.jpg'),
	('Michael Bay','C:\Java\FinalPresent\src\main\java\Icon\Micheal-Bay.jpg');

CREATE TABLE Movies 
( 
	MovieID INT PRIMARY KEY IDENTITY(1,1), 
	Title NVARCHAR(255) NOT NULL, 
	ReleaseDate DATE, 
	IdDirector INT ,
	FOREIGN KEY (IdDirector) REFERENCES Directors(IdDirector),
	Duration Float,
	DescriptionMovie NVARCHAR(500),
	Score Float,
	Price Float,
);

insert into Movies(Title,ReleaseDate,IdDirector,Duration,DescriptionMovie,Score,Price) values
	('Interstellar',	NULL,	1,	NULL,	N'Interstellar là một bộ phim khoa học viễn tưởng năm 2014 của đạo diễn Christopher Nolan. Với dàn diễn viên gồm Matthew McConaughey, Timothee Chalamet, Anne Hathaway, Jessica Chastain, Bill Irwin, Ellen Burstyn và Michael Caine, bộ phim kể về một nhóm nhà du hành vũ trụ đi xuyên qua hố đen',	9,	100000),
	('Oppenheimer',	NULL,	1,	NULL,	N'Oppenheimer là một bộ phim điện ảnh Anh – Mỹ thuộc thể loại tiểu sử – tâm lý – giật gân – chính kịch công chiếu vào năm 2023 do Christopher Nolan làm đạo diễn, viết kịch bản và đồng sản xuất.',	9,	100000),
	('Dark Knight Rise',	NULL,	1,	NULL,	N'Kỵ sĩ bóng đêm trỗi dậy là một bộ phim siêu anh hùng, ra mắt năm 2012, được đạo diễn bởi Christopher Nolan. Đồng thời, Christopher Nolan cùng với em trai Jonathan Nolan cũng là hai nhà biên kịch của phim. Phần cốt truyện của Kỵ sĩ bóng đêm trỗi dậy do David S. Goyer đảm nhận.',	8.9,	100000),
	('Transformer:2007', NULL,	2, NULL,	N'Transformer là một phim hành động khoa học viễn tưởng của Mỹ năm 2007 dựa trên dòng đồ chơi cùng tên của Hasbro. Đây là phần đầu tiên trong loạt phim người đóng Transformers. Bộ phim được đạo diễn bởi Michael Bay từ kịch bản của Roberto Orci và Alex Kurtzman.',	8.7,	100000);
CREATE TABLE Films 
(
    MovieID INT PRIMARY KEY, 
    UrlPoster NVARCHAR(2083) NOT NULL, 
	UrlVideo NVARCHAR(2083) NOT NULL,
	FOREIGN KEY (MovieID) REFERENCES Movies(MovieID)
);

insert into Films values
	(4, 'C:\Java\FinalPresent\src\main\java\Icon\Transformer2007.jpg','C:\Java\FinalPresent\src\main\java\Video\Transformers (2007) Trailer #1 - Movieclips Classic Trailers.mp4'),
	(1,	'C:\Java\FinalPresent\src\main\java\Icon\unnamed.jpg',	'C:\Java\FinalPresent\src\main\java\Video\Interstellar - Trailer - Official Warner Bros. UK.mp4'),
	(2,	'C:\Java\FinalPresent\src\main\java\Icon\Oppenheimer_–_Vietnam_poster.jpg',	'C:\Java\FinalPresent\src\main\java\Video\Oppenheimer - Official Trailer.mp4'),
	(3,	'C:\Java\FinalPresent\src\main\java\Icon\Dark_knight_rises_poster.jpg','C:\Java\FinalPresent\src\main\java\Video\The Dark Knight Rises Official Movie Trailer Christian Bale, Batman Movie (2012) HD.mp4');


CREATE TABLE Actors
(
    ActorID INT PRIMARY KEY IDENTITY(1,1),
    NameActor NVARCHAR(100) NOT NULL,
	ActorImgURL NVARCHAR(2083) NOT NULL
);


insert into Actors(NameActor,ActorImgURL) values
	('Megan Fox','C:\Java\FinalPresent\src\main\java\Icon\megan-fox.jpg'),
	('Shia LaBeouf','C:\Java\FinalPresent\src\main\java\Icon\Shia-LaBeaouf.jpg'),
	('Matthew McConaughey','C:\Java\FinalPresent\src\main\java\Icon\Matthew_McConaughey.jpg'),
	('Anne Hathaway','C:\Java\FinalPresent\src\main\java\Icon\Anne_Hathaway.jpg'),
	('Cillian Murphy','C:\Java\FinalPresent\src\main\java\Icon\cillian-murphy.jpg'),
	('Robert Downey Jr.','C:\Java\FinalPresent\src\main\java\Icon\Robert-Downey-Jr.jpg'),
	('Christian Bale','C:\Java\FinalPresent\src\main\java\Icon\Christian-Bale.jpg'),
	('Tom Hardy','C:\Java\FinalPresent\src\main\java\Icon\Tom-Hardy.jpg')

CREATE TABLE MovieActors
(
    MovieID INT,
    ActorID INT,
    RoleAct NVARCHAR(100),
    PRIMARY KEY (MovieID, ActorID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
    FOREIGN KEY (ActorID) REFERENCES Actors(ActorID)
);

insert into MovieActors values
	(4,1,'Mikaela Banes'),
	(4,2,'Sam Witwicky'),
	(1,3,'Joseph Cooper'),
	(1,4,'Dr.Amelia Brand'),
	(2,5,'Robert Oppenheimer'),
	(2,6,'Lewis Strauss'),
	(3,7,'Bruce Wayne/Batman'),
	(3,8,'Bane'),
	(3,4,'Selina Kyle/Catwoman')

create table LoginAcc
(
	UserID INT PRIMARY KEY IDENTITY(1,1),
	Email varchar(50) NOT NULL UNIQUE,
	Pass varchar(50) NOT NULL,	
	constraint UC_LoginAcc UNIQUE (Email,Pass),
);
insert into LoginAcc(Email,Pass) values
	('m@gmail.com','825acbdc0b09216590e8b189b8af292cb62cf05d'),--pass:Anmisoi123!
	('q@gmail.com','5638c2f0b22ed3dbe8dc23297a3d8e4c9a52722b');--pass:Anmisoi234!

Create table Img
(
	IDImg INT primary key IDENTITY(1,1),
	UrlImg  NVARCHAR(2083) not null,
);


CREATE TABLE UserL
(
	UserID INT PRIMARY KEY,
	RoleAcc VARCHAR(50) not null,
	Email VARCHAR(50) UNIQUE,
	PhoneNum VARCHAR(20),
	NameUser NVARCHAR(100),
	Gender NVARCHAR(4),
	Birth date,
	UrlAvatar  NVARCHAR(2083) not null,
	UrlTheme  NVARCHAR(2083) not null,
	Foreign key (UserID) references LoginAcc,
);

insert into UserL values
	(1,'admin','m@gmail.com',NULL,'Admin1','m','2004-01-01','C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png','C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png'),
	(2,'admin','q@gmail.com',NULL,'Admin2','f','2004-01-01','C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png','C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png');
CREATE TABLE Comments
(
	CmtID int PRIMARY KEY IDENTITY(1,1) ,
    MovieID INT,
    UserID INT,
    Comment NVARCHAR(500),
	TimeCmt varchar(100),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
	FOREIGN KEY (UserID) REFERENCES UserL(UserID),
);

create table Ratings
(
	RateID int PRIMARY KEY IDENTITY(1,1) ,
	MovieID INT,
    UserID INT,
    Rating int,
	unique(MovieID,UserID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
	FOREIGN KEY (UserID) REFERENCES UserL(UserID),
);
--Trigger khi có điểm mới thì điểm ở phim sẽ thay đổi
CREATE TRIGGER UpdateMovieScore
ON Ratings
AFTER INSERT
AS
BEGIN
    DECLARE @MovieID INT;
    DECLARE @AvgRating FLOAT;

    -- Lấy MovieID từ đánh giá vừa được thêm
    SELECT @MovieID = inserted.MovieID FROM inserted;

    -- Tính toán điểm số trung bình của phim và lưu vào biến tạm thời
    SELECT @AvgRating = AVG(Rating)
    FROM Ratings
    WHERE MovieID = @MovieID;

    -- Cập nhật điểm số trung bình vào bảng Movies
    UPDATE Movies
    SET Score = @AvgRating
    WHERE MovieID = @MovieID;
END;
drop trigger UpdateMovieScore

create table WatchList
(
	ListID int PRIMARY KEY IDENTITY(1,1) ,
	MovieID INT,
    UserID INT,
	unique(MovieID,UserID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
	FOREIGN KEY (UserID) REFERENCES UserL(UserID),
);



drop table Comments
drop table Ratings
drop table Actors
drop table MovieActors
drop table Films
drop table Movies
drop table Directors




drop table UserL
drop table LoginAcc



--trigger khi có tài khoản mới được tạo ở bảng loginacc thì bảng account cũng có dòng tương tự(tài khoản người dùng)
CREATE TRIGGER trgAfterInsertLogin
ON LoginAcc 
AFTER INSERT
AS
BEGIN
	DECLARE @urlPrefixAva NVARCHAR(255) = 'C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png'
	DECLARE @urlPrefixTheme NVARCHAR(255) = 'C:/Java/FinalPresent/src/main/java/Icon/rsz_1logoo.png'
    INSERT INTO UserL (UserID,NameUser, Email,RoleAcc ,UrlTheme, UrlAvatar)
    SELECT UserID,'User'+UserID, Email,'user',@urlPrefixTheme, @urlPrefixAva
    FROM inserted
END
drop trigger trgAfterInsertLogin


