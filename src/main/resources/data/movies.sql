create schema IF NOT EXISTS imdb;
use imdb;
drop table IF EXISTS movies;

create table movies (
                        ID int auto_increment primary key,
                        title varchar(100) ,
                        year int,
                        length int ,
                        subject varchar(50),
                        popularity int ,
                        awards varchar(3)
)