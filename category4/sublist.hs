sublist beginning end xs
 | beginning >= 0 && end >= 0 = takeWhile (< end). drop beginning $ xs
 | beginning < 0 && end < 0 =  takeWhile (< index2). drop index $ xs
 | beginning < 0 = takeWhile (< end). drop index $ xs
 | otherwise = takeWhile (< index2). drop beginning $ xs
 where index = beginning + length xs
       index2 = end + length xs

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int 
    c <- readLn :: IO [Int]
    print $ sublist a b c

