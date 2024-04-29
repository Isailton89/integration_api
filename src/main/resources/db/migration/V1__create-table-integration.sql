create table integrations(

    id varchar(50) primary key,
    date_register varchar(100),
    contact varchar(50),
    status varchar(20),
    half_finisher varchar(20),
    error varchar(600),
    responsible varchar(20),
    is_integrated boolean

);