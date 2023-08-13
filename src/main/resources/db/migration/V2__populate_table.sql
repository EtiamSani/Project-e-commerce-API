INSERT INTO Products (
    id,
    productName,
    price,
    description,
    quantityInStock,
    category,
    brand,
    color,
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
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', 'T-shirt à motif de nuages', 45,
     -- Description du produit
     'Ce T-shirt à motif de nuages est un véritable hommage à la beauté éthérée du ciel...',
     100, 'Vêtements', 'SkyWear', 'Blanc', 'Coton', 'Hommes', 30, true, true, false,
     'tshirt, basique, blanc', '/images/tshirt-cloud.png', true),

     ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', 'T-shirt à motif de nuages', 45,
     -- Description du produit
     'Plongez dans l''émerveillement du ciel avec ce T-shirt à motif de nuages. Les détails minutieux et les nuances apaisantes de bleu et de blanc créent une esthétique captivante. Que vous le portiez en journée ou en soirée, ce T-shirt ajoutera une touche de rêverie à votre style.',
     100, 'Vêtements', 'SkyWear', 'Bleu', 'Coton', 'Hommes', 30, true, true, false,
     'tshirt, moderne, bleu', '/images/tshirt-clouds-bleu-mountains.png', true),

    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', 'T-shirt à motif de nuages', 28,
     -- Description du produit
     'Explorez les horizons infinis avec ce T-shirt à motif de nuages. Les teintes douces de gris et de blanc s''entremêlent harmonieusement, créant une sensation de sérénité. Confortable et élégant, ce T-shirt est parfait pour ceux qui aiment s''évader dans leurs pensées.',
     80, 'Vêtements', 'AirCloud', 'Gris', 'Coton', 'Femmes', 20, true, false, true,
     'tshirt, décontracté, gris', '/images/tshirt-clouds-red-and-bleu.png', true),

     ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', 'T-shirt à motif de cerf', 35,
     -- Description du produit
     'Laissez-vous enchanter par la majesté de la nature avec ce T-shirt à motif de cerf. Le cerf, symbole de grâce et de liberté, est magnifiquement illustré sur ce T-shirt. Les tons chauds et terreux rappellent l''ambiance apaisante des forêts. Portez ce T-shirt pour afficher votre amour de la faune et votre passion pour l''extérieur.',
     100, 'Vêtements', 'NatureWear', 'Terre', 'Coton', 'Unisexe', 30, true, true, false,
     'tshirt, motif de cerf, terre', '/images/tshirt-deer.png', true),

     ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', 'T-shirt à motif d''yeux', 25,
     -- Description du produit
     'Exprimez votre style unique avec ce T-shirt à motif d''yeux captivant. Les yeux sont des fenêtres vers l''âme, et ce motif intrigant attire instantanément le regard. Les couleurs vives et le contraste saisissant font de ce T-shirt un choix audacieux pour les esprits créatifs. Ajoutez une touche de mystère à votre garde-robe avec ce T-shirt artistique.',
     120, 'Vêtements', 'ArtisticApparel', 'Noir', 'Coton', 'Femmes', 0, false, true, false,
     'tshirt, motif d''yeux, noir', '/images/tshirt-eyes-pattern.png', true),

     ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif jardin', 28,
     -- Description du produit
     'Plongez dans un monde de nature luxuriante avec ce T-shirt à motif jardin. Les couleurs vives et les détails floraux créent une esthétique vivifiante. Que ce soit pour une journée en plein air ou simplement pour apporter un peu de nature à votre style, ce T-shirt est un choix parfait.',
     90, 'Vêtements', 'NatureWear', 'Blanc', 'Coton', 'Unisexe', 20, true, false, true,
     'tshirt, motif jardin, vert', '/images/tshirt-garden.png', true),

     ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif jardin v2', 30,
     -- Description du produit
     'Une nouvelle version du T-shirt motif jardin, encore plus élégante et détaillée. Laissez-vous envoûter par la beauté de la nature avec ce T-shirt artistique. Les motifs floraux délicats ajoutent une touche d''élégance à votre tenue.',
     75, 'Vêtements', 'NatureWear', 'Blanc', 'Coton', 'Unisexe', 25, false, true, false,
     'tshirt, motif jardin, blanc', '/images/tshirt-garden-v2.png', true),

     ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif super-héros', 40,
     -- Description du produit
     'Canalisez votre héros intérieur avec ce T-shirt motif super-héros. Les couleurs dynamiques et le design captivant ajoutent une touche d''audace à votre style. Que vous soyez un fan de comics ou que vous aimiez simplement vous démarquer, ce T-shirt est fait pour vous.',
     85, 'Vêtements', 'HeroWear', 'Bleu', 'Coton', 'Unisexe', 30, false, true, false,
     'tshirt, motif super-héros, bleu', '/images/tshirt-hero.png', true),

     ('11d1ee6d-418f-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif hibou noir', 28,
     -- Description du produit
     'Découvrez la sagesse de la nuit avec ce T-shirt motif hibou noir. Le motif détaillé du hibou ajoute une touche mystique à votre style. Portez ce T-shirt pour exprimer votre connexion avec la nature nocturne.',
     95, 'Vêtements', 'NatureWear', 'Noir', 'Coton', 'Unisexe', 20, true, false, true,
     'tshirt, motif hibou, noir', '/images/tshirt-owl-black.png', true),

     ('7aefdc3b-5186-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif géométrique noir', 32,
     -- Description du produit
     'Ajoutez une touche d''élégance à votre tenue avec ce T-shirt motif géométrique noir. Les motifs complexes créent un design artistique moderne. Que vous soyez en ville ou à un événement, ce T-shirt vous démarquera.',
     120, 'Vêtements', 'ArtWear', 'Noir', 'Coton', 'Unisexe', 30, false, true, false,
     'tshirt, motif géométrique, noir', '/images/tshirt-pattern-black.png', true),

     ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', 'T-shirt motif éléphant', 29,
     -- Description du produit
     'Explorez la majesté de la faune avec ce T-shirt motif éléphant. Le motif éléphant ajoute une touche exotique à votre style. Que vous soyez en voyage ou en ville, ce T-shirt sera votre compagnon idéal.',
     80, 'Vêtements', 'WildLife', 'Jaune', 'Coton', 'Unisexe', 0, true, true, false,
     'tshirt, motif éléphant, jaune', '/images/tshirt-pattern-elephant.png', true),

     ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', 'T-shirt coucher de soleil', 35,
     -- Description du produit
     'Capturez la beauté apaisante d''un coucher de soleil avec ce T-shirt coucher de soleil. Les couleurs chaudes et le design évoquent la tranquillité d''une fin de journée. Ce T-shirt sera votre compagnon de détente idéal.',
     110, 'Vêtements', 'RelaxWear', 'Blanc', 'Coton', 'Unisexe', 33, false, true, true,
     'tshirt, coucher de soleil, blanc', '/images/tshirt-sunset.png', true),

     ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', 'T-shirt deux nuages', 26,
     -- Description du produit
     'Laissez votre imagination s''envoler avec ce T-shirt deux nuages. Le motif délicat des nuages évoque la liberté et la rêverie. Que vous soyez en train de vous détendre ou de sortir, ce T-shirt ajoutera une touche aérienne à votre style.',
     90, 'Vêtements', 'DreamWear', 'Blanc', 'Coton', 'Unisexe', 20, true, false, false,
     'tshirt, nuages, blanc', '/images/tshirt-two-clouds.png', true),

     ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', 'T-shirt motifs vagues', 31,
     -- Description du produit
     'Plongez dans l''énergie apaisante de l''océan avec ce T-shirt motifs vagues. Le design captivant des vagues évoque le mouvement constant de la mer. Ce T-shirt sera un ajout dynamique à votre garde-robe décontractée.',
     75, 'Vêtements', 'WaveWear', 'Blanc', 'Coton', 'Unisexe', 30, false, true, false,
     'tshirt, vagues, blanc', '/images/tshirt-waves.png', true),

     ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', 'T-shirt motifs vagues v2', 32,
     -- Description du produit
     'Explorez les profondeurs mystérieuses de l''océan avec ce T-shirt motifs vagues v2. Le design ondulant des vagues évoque l''immensité et le calme de la mer. Ce T-shirt ajoutera une touche naturelle et apaisante à votre tenue.',
     85, 'Vêtements', 'WaveWear', 'Bleu', 'Coton', 'Unisexe', 30, true, false, false,
     'tshirt, vagues, bleu', '/images/tshirt-waves-v2.png', true),

    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', 'T-shirt cerf blanc', 28,
     -- Description du produit
     'Célébrez la majesté de la faune avec ce T-shirt cerf blanc. Le motif élégant d''un cerf évoque la grâce et la beauté de la nature. Ce T-shirt ajoutera une touche de caractère à votre look quotidien.',
     95, 'Vêtements', 'WildLife', 'Blanc', 'Coton', 'Unisexe', 0, false, false, true,
     'tshirt, cerf, blanc', '/images/tshirt-white-deer.png', true),

     ('9bfbecc2-b1c2-2bf1-907c-9f5b7f18b8f7', 'T-shirt femme papillon', 29,
     -- Description du produit
     'Exprimez votre côté enchanteur avec ce T-shirt femme papillon. Le motif délicat d''un papillon évoque la légèreté et la transformation. Ce T-shirt sera une pièce maîtresse de votre collection estivale.',
     88, 'Vêtements', 'FlutterWear', 'Multicolore', 'Coton', 'Femme', 28, true, true, false,
     'tshirt, femme, papillon', '/images/tshirt-woman-butterfly.png', true),

     ('e9f87a24-c178-2bf1-907c-9f5b7f18b8f7', 'T-shirt femme fleurs', 27,
     -- Description du produit
     'Faites éclore votre élégance avec ce T-shirt femme fleurs. Le motif coloré de fleurs évoque la beauté et la vitalité de la nature. Ce T-shirt ajoutera une touche florale et raffinée à votre style.',
     0, 'Vêtements', 'BlossomWear', 'Multicolore', 'Coton', 'Femme', 26, false, false, true,
     'tshirt, femme, fleurs', '/images/tshirt-woman-flowers.png', false);



INSERT INTO Sizes (id, size)
VALUES
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f1', 'S'),
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1', 'M'),
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1', 'L'),
    ('11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1', 'XL'),
    ('7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1', 'XXL');

INSERT INTO Product_have_sizes (product_id, size_id)
VALUES
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('971a7529-7b1b-4cf7-af09-5cd4ea3e04d1', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('b1c1f25e-4d98-497e-8eaa-8a59ce0b14f3', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('d2c3e4f5-6a7b-8c9d-1e2f-3a4b5c6d7e8f', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('829b41b4-e1b5-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('5b5df509-1d19-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('1a19eddd-2f57-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('9b596692-61a9-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('72a9a054-7183-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('c9f50c1a-81ad-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('2a150e7e-91de-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('5f01b5ea-a1ed-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('bd4ff942-f1aa-2bf1-907c-9f5b7f18b8f7', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1'),
    --
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '5b5df509-1d19-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '1a19eddd-2f57-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7ac6f8f7-3fc3-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '11d1ee6d-418f-2bf1-907c-9f5b7f18b8f1'),
    ('f6aeb17b-318e-4e47-b04d-8a10b570e7e2', '7aefdc3b-5186-2bf1-907c-9f5b7f18b8f1');

