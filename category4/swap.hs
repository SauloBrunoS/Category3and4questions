
validindexes xs index1 index2
  | index1 < length xs && index2 < length xs = True  
  | otherwise = False 

swap :: [a] -> Int -> Int -> [a]
swap xs a b 
 | validindexes xs a b = let elemI = xs !! a
                             elemJ = xs !! b
                             left = take a xs
                             middle = take(b - a - 1) (drop (a+1) xs)
                             right = drop (b+1) xs
                         in  left ++ [elemJ] ++ middle ++ [elemI] ++ right   
 | otherwise = xs

 
main = do 
   a <-readLn :: IO [Int]
   b <- readLn :: IO Int 
   c <- readLn :: IO Int 
   print $ swap a b c