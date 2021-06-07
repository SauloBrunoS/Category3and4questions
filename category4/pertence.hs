pertence x u = notNUll $ filter (==x) u
 where notNUll xs = not(null xs)
{-
pertence x u = notNull $ [n | n <- u, n == x]
 where notNull xs = not(null xs)
-}
{-
pertence _ [] = False 
pertence y (x:xs) = if (x == y) then True else pertence y xs
-}
-- pertence x u = x `elem` u

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ pertence a b    

