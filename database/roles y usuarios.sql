create role administrador_hotel;
create role recepcionista_hotel;
create role limpieza_hotel;


grant all privileges on hotel.* to administrador_hotel;
grant select, insert, update, delete on hotel.* to recepcionista_hotel;
grant select, update on hotel.* to limpieza_hotel;

grant administrador_hotel to admin;
-- grant recepcionista_hotel on hotel.* to test1@'localhost' identified by 'test1';


