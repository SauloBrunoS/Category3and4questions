-- somaImpares xs = sum (filter odd xs) 

-- somaImpares xs = sum [x | x <- xs, odd x]

-- somaImpares = foldl (\acc x -> if odd x then acc + x else acc) 0

somaImpares [] = 0
somaImpares (x:xs)
  | odd x = x + somaImpares xs
  | otherwise = somaImpares xs

main = do
    a <- readLn :: IO [Int]
    print $ somaImpares a