-- maior xs = foldl1 (\acc y -> if(acc > y) then acc else y) xs 

maior [x] = x
maior (x:xs)
 | x > restMax xs = x
 | otherwise = restMax xs
 where restMax xs = maior xs  

main = do
    a <- readLn :: IO [Int]
    print $ maior a
    