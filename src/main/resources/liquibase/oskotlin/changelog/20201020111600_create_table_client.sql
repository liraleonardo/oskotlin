--liquibase formatted sql

--changeset bob:1

CREATE TABLE oskotlin.client
(
  id bigserial NOT NULL,
  name character varying(100) NOT NULL,
  phone_number character varying(100),
  email character varying(150) NOT NULL,
  CONSTRAINT client_pkey PRIMARY KEY (id)
);
