create table if not exists public.image (
    id uuid primary key,
    name varchar(255),
    image_content oid,
    content_type varchar(100),
    length long
);