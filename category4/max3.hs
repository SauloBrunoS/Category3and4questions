-- max3 x y z = max x $ max y z
-- max3 x y = max x. max y 

max3 x y z
  | x >= y && x >= z = x
  | y >= z = y
  | otherwise = z
   

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    print $ max3 a b c