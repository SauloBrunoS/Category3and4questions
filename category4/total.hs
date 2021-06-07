total [] = 0
total (x:xs) = 1 + total xs

-- total xs = foldr (\ _  acc-> acc + 1) 0 xs

-- total xs = sum $ map (const 1) xs


main = do

a <- readLn :: IO[Int]
print $ total a