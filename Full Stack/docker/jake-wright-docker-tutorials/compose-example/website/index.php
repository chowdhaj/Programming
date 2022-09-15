<!DOCTYPE html>
<html>
<head>
    <title>My Grocery Store</title>
</head>
<body>
    <h1>
        Grab Some Fresh Food!
    </h1>
    <ul>
        <?php
            $json = file_get_contents('http://product-service');
            $obj  = json_decode($json);

            $products = $obj->products;
            foreach ($products as $product) {
                echo "<li>$product</li>";
            }
        ?>
    </ul>
</body>
</html>