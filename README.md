# Sorting Algorithms — Java
implementasi Bubble Sort dan Binary Insertion Sort dari nol tanpa menggunakan library sorting bawaan.

## Struktur File
sorting-algorithms/
├── BubbleSort.java
├── BinaryInsertionSort.java
└── README.md

##  Bubble Sort

### Penjelasan
Bubble Sort bekerja dengan cara membandingkan dua elemen yang berdekatan, lalu menukarnya jika urutannya salah. Proses ini diulang terus dari awal hingga seluruh array terurut. Disebut "bubble" karena elemen terbesar akan "menggelembung" ke posisi paling akhir di setiap iterasi.

### Langkah-langkah
1. Bandingkan elemen pertama dan kedua
2. Jika elemen pertama lebih besar, tukar posisinya
3. Lanjut ke elemen berikutnya
4. Ulangi sampai tidak ada lagi pertukaran

### Contoh
```
Array awal : [64, 34, 25, 12, 22, 11, 90]

Iterasi 1  : [34, 25, 12, 22, 11, 64, 90]
Iterasi 2  : [25, 12, 22, 11, 34, 64, 90]
Iterasi 3  : [12, 22, 11, 25, 34, 64, 90]
Iterasi 4  : [12, 11, 22, 25, 34, 64, 90]
Iterasi 5  : [11, 12, 22, 25, 34, 64, 90]

Hasil akhir: [11, 12, 22, 25, 34, 64, 90]
```

### Kompleksitas
| Kasus | Time Complexity | Space Complexity |
|-------|----------------|-----------------|
| Terbaik | O(n²) | O(1) |
| Rata-rata | O(n²) | O(1) |
| Terburuk | O(n²) | O(1) |

### Contoh Penggunaan
```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};
BubbleSort.bubbleSort(arr);
// Output: [11, 12, 22, 25, 34, 64, 90]
```

---

## Binary Insertion Sort

### Penjelasan
Binary Insertion Sort adalah pengembangan dari Insertion Sort. Cara kerjanya adalah mengambil satu elemen, lalu mencari posisi yang tepat di bagian array yang sudah terurut menggunakan **Binary Search**, kemudian menyisipkannya di posisi tersebut.

### Langkah-langkah
1. Ambil elemen ke-i (mulai dari indeks 1)
2. Gunakan binary search untuk mencari posisi sisipan di bagian kiri yang sudah terurut
3. Geser semua elemen ke kanan untuk memberi ruang
4. Sisipkan elemen di posisi yang ditemukan
5. Ulangi sampai semua elemen terurut

### Contoh
Array awal : [64, 34, 25, 12, 22, 11, 90]

Ambil 34   : cari posisi → [34, 64, 25, 12, 22, 11, 90]
Ambil 25   : cari posisi → [25, 34, 64, 12, 22, 11, 90]
Ambil 12   : cari posisi → [12, 25, 34, 64, 22, 11, 90]
Ambil 22   : cari posisi → [12, 22, 25, 34, 64, 11, 90]
Ambil 11   : cari posisi → [11, 12, 22, 25, 34, 64, 90]
Ambil 90   : cari posisi → [11, 12, 22, 25, 34, 64, 90]

Hasil akhir: [11, 12, 22, 25, 34, 64, 90]

### Kompleksitas
| Kasus | Time Complexity | Space Complexity |
|-------|----------------|-----------------|
| Terbaik | O(n log n) | O(1) |
| Rata-rata | O(n²) | O(1) |
| Terburuk | O(n²) | O(1) |

### Contoh Penggunaan
```java
int[] arr = {64, 34, 25, 12, 22, 11, 90};
BinaryInsertionSort.binaryInsertionSort(arr);
// Output: [11, 12, 22, 25, 34, 64, 90]
```

---

## Cara Menjalankan

```bash
# Compile
javac BubbleSort.java
javac BinaryInsertionSort.java

# Jalankan
java BubbleSort
java BinaryInsertionSort
```

---

## Perbandingan Algoritma

| Algoritma | Best | Average | Worst | Stabil? |
|-----------|------|---------|-------|---------|
| Bubble Sort | O(n²) | O(n²) | O(n²) | ✅ Ya |
| Binary Insertion Sort | O(n log n) | O(n²) | O(n²) | ✅ Ya |
