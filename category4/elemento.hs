{-
elemento n xs
  | n >= 0 = xs !! n
  | otherwise = xs !! index
  where index = n + length xs
-}

elemento n (x:xs) 
  | n == 0 = x
  | n > 0 = elemento (n-1) xs 
  | otherwise = elemento index (x:xs)
  where index = n + length (x:xs)

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ elemento a b 