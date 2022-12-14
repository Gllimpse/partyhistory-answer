create table `partyhistory`.questions
(
    id           int auto_increment
        primary key,
    question     text null,
    answer       text null,
    right_answer char null
);

create table `partyhistory`.user
(
    id       int auto_increment
        primary key,
    account  varchar(256) not null,
    password varchar(256) not null,
    constraint user_account_uindex
        unique (account)
);

create table `partyhistory`.scores
(
    id          int auto_increment
        primary key,
    update_time datetime null,
    score       int      null,
    user_id     int      not null,
    constraint scores_user_id_fk
        foreign key (user_id) references `partyhistory`.user (id)
);

