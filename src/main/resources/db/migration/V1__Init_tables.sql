CREATE SEQUENCE products_id_seq;

CREATE TABLE Products (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    productName TEXT,
    price INT,
    description TEXT,
    quantityInStock INT,
    category TEXT,
    brand TEXT,
    color TEXT,
    size TEXT,
    material TEXT,
    gender TEXT,
    discountPrice INT,
    isNewArrival BOOLEAN,
    isFeatured BOOLEAN,
    isBestSeller BOOLEAN,
    tags TEXT,
    images TEXT,
    isAvailable BOOLEAN
);
