CREATE TABLE public.delivery (
	id bigserial NOT NULL,
	address varchar(255) NULL,
	client_id int8 NULL,
	delivery_date timestamp NULL,
	products text NULL,
	CONSTRAINT delivery_pkey PRIMARY KEY (id)
);