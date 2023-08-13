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

CREATE TABLE Sizes (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    size TEXT
);

CREATE TABLE Product_have_sizes (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    product_id UUID REFERENCES Products(id),
    size_id UUID REFERENCES Sizes(id)
);



