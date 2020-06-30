CREATE TABLE public.bills (
	id bigserial NOT NULL,
	client_id int8 NULL,
	created_at timestamp NULL,
	products text NULL,
	total float8 NULL,
	CONSTRAINT bills_pkey PRIMARY KEY (id)
);