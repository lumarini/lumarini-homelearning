create table GOT_characters (
  Name varchar(255),
  Age int,
  Area varchar(255),
  House varchar(255),
  Weapon varchar(255),
  Last_season int
);

create table GOT_actors (
  Fname varchar(255),
  LName varchar(255),
  CharacterName varchar(255)
);

insert into GOT_characters values (
  'Jon Snow', 32, 'Winterfell', 'Stark','spade', 8);

insert into GOT_actors values (
  'Kit','Harington','Jon Snow');

insert into GOT_characters values (
  'Ned Stark',  56, 'Winterfell','Stark', 'spade', 1);

insert into GOT_actors values ( 
  'Sean','Bean','Ned Stark');

insert into GOT_characters values (
  'Catelyn Stark', 49, 'Winterfell', 'Stark', 'none', 3);

insert into GOT_actors values (
  'Michelle','Fairley','Catelyn Stark');

insert into GOT_characters values (
  'Sansa Stark', 19, 'Winterfell', 'Stark', 'poison', 8);

insert into GOT_actors values (
  'Sophie','Turner','Sansa Stark');

insert into GOT_characters values (
  'Aria Stark', 12, 'Winterfell', 'Stark', 'Needle', 8);

insert into GOT_actors values (
  'Maisie','Williams','Aria Stark');

insert into GOT_characters values (
  'Bran Stark', 9, 'Winterfell', 'Stark', 'Warg', 8);

insert into GOT_actors values (
  'Isaac','Hampstead Wright', 'Bran Stark');

insert into GOT_characters values (
  'Cersei Lannister', 41, 'Kings Landing', 'Lannister', 'poison', 8);

insert into GOT_actors values (
  'Lena','Headey','Cersei Lannister' );

insert into GOT_characters values (
  'Jaime Lannister', 41, 'Kings Landing', 'Lannister', 'poison', 8);

insert into GOT_actors values (
  'Nicolaj','Coster-Waldau','Jaime Lannister');

insert into GOT_characters values (
  'Tywin Lannister', 65, 'Casterly Rock', 'Lannister', 'political power', 3);

insert into GOT_actors values (
  'Charles','Dance','Tywin Lannister');

insert into GOT_characters values (
  'Tyrion Lannister', 38, 'Kings Landing', 'Lannister', 'any', 8);

insert into GOT_actors values (
  'Peter','Dinklage','Tyrion Lannister' );

insert into GOT_characters values ( 
  'Ellaria Sand', 41, 'Dorne', 'Martell', 'poison', 7);

insert into GOT_actors values (
  'Indira','Varma','Ellaria Sand' );

insert into GOT_characters values (
  'Oberyn Martell', 41, 'Dorne', 'Martell', 'spear', 4);

insert into GOT_actors values (
  'Pedro','Pascal','Oberyn Martell' );

insert into GOT_characters values (
  'Doran Martell', 46, 'Dorne', 'Martell', 'spear', 4);

insert into GOT_actors values (
  'Alexander','Siddig','Doran Martell' );

insert into GOT_characters values (
  'Margaery Tyrell', 22, 'Highgarden', 'Tyrell', 'charm', 5);

insert into GOT_characters values ( 
  'Loras Tyrell', 26, 'Highgarden', 'Tyrell', 'jousting', 5);

insert into GOT_actors values (
  'Finn','Jones','Loras Tyrell' );

insert into GOT_characters values (
  'Joffrey Baratheon', 17, 'Kings Landing', 'Baratheon', 'any', 4);

insert into GOT_actors values (
  'Jack','Gleeson','Joffrey Baratheon');

insert into GOT_characters values (
  'Tommen Baratheon', 12, 'Kings Landing', 'Baratheon', 'none', 5 );

insert into GOT_actors values (
  'Dean-Charles','Chapman','Tommen Baratheon' );

insert into GOT_characters values (
  'Petyr Baelish', 42, 'The Fingers', 'none', 'any', 8 );

insert into GOT_actors values (
  'Aidan','Gillen','Petyr Baelish' );

insert into GOT_actors values (
  'Natalie','Dormer','Margaery Tyrell' );

insert into GOT_characters values (
  'Robert Baratheon'
  , 52
  , 'Storms End'
  , 'Baratheon'
  , 'Battle Hammer'
  , 1
  );

insert into GOT_actors values (
  'Mark'
  , 'Addy'
  , 'Robert Baratheon'
  );



-- insert into GOT_characters values (
--   [Name]
--   , [age]
--   , [Area]
--   , [House]
--   , [Weapon]
--   , [last_season] 
--   );

-- insert into GOT_actors values (
--   [FirstName]
--   , [Lastname]
--   , [Char name]
--   );



-- insert into GOT_characters values (
--   [Name]
--   , [age]
--   , [Area]
--   , [House]
--   , [Weapon]
--   , [last_season] 
--   );

-- insert into GOT_actors values (
--   [FirstName]
--   , [Lastname]
--   , [Char name]
--   );


-- select * from GOT_actors AS actors, GOT_characters AS chars
-- WHERE actors.CharacterName = chars.Name;


-- select actors.Fname, actors.LName, chars.Name, chars.House
-- FROM GOT_actors AS actors, GOT_characters AS chars
-- WHERE actors.CharacterName = chars.Name;


-- select * from GOT_characters WHERE "House" = "Stark";


-- select * from GOT_characters WHERE "Age" < 10 OR "Age" > 60;


--select * from GOT_actors WHERE "Fname" LIKE "J%";


--SELECT * from GOT_characters WHERE "House" = "Tyrell";


-- SELECT name, Weapon from GOT_characters WHERE "Area" = "Winterfell";