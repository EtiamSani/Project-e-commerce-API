INSERT INTO Products (
    id,
    productName,
    price,
    description,
    quantityInStock,
    category,
    brand,
    color,
    size,
    material,
    gender,
    discountPrice,
    isNewArrival,
    isFeatured,
    isBestSeller,
    tags,
    images,
    isAvailable
)
VALUES
    ('47896b26-b0c9-4877-90da-38749b9efebf', 'T-shirt basique blanc', 20, 'T-shirt basique en coton blanc pour hommes', 100, 'Vêtements', 'Ma Marque', 'Blanc', 'M', 'Coton', 'Hommes', 0, true, true, false, 'tshirt, basique, blanc', 'http://example.com/images/tshirt-blanc-1.jpg', true),
    ('9deba5e2-58e7-4ef4-9212-488f7e0d9f1f', 'T-shirt imprimé noir', 25, 'T-shirt imprimé en coton noir pour hommes', 80, 'Vêtements', 'Ma Marque', 'Noir', 'L', 'Coton', 'Hommes', 0, true, false, true, 'tshirt, imprimé, noir', 'http://example.com/images/tshirt-noir-1.jpg', true);