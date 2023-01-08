#insertion sort
[22,27,16,2,18,6] 
Insertion sortta Key değeri belirlenir(index).Küçük olan sola veya sağa yazılır.
1.aşama
22 ile 27 ye bakarsak doğru sıralama 
[22,27,16,2,18,6] 
2.aşama 27 ile 16 ya bakarsak 16 yanlış
[22,16,27,2,18,6] 
[16,22,27,2,18,6]
3.aşama 27 ile 2 ye bakarsak yanlış
[16,22,2,27,18,6]
[16,2,22,27,18,6]
[2,16,22,27,18,6]
4.aşama 27 ile 18 yanlış
[2,16,22,18,27,6]
[2,16,18,22,27,6]
5.aşama 27 ile 6 yanlış
[2,16,18,22,6,27]
[2,16,18,6,22,27]
[2,16,6,18,22,27]
[2,6,16,18,22,27]

big o (n^2) quadratic bir büyüme gerçekleştirir.
18 sayısı avarage case e girer worst case e yakın olmasına rağmen

#Selection Sort
[7,3,5,8,2,9,4,15,6]
ilk index ile bakıcak en küçük olan sayıyı bularak onunla yer değiştirecek.
1.adım
[2,3,5,8,7,9,4,15,6]
2.adım
[2,3,4,8,7,9,5,15,6]
3.adım 
[2,3,4,5,7,9,8,15,6]
4.adım
[2,3,4,5,6,9,8,15,7]

www.patika.dev
