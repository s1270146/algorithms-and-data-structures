#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  // Input
  int n;
  cin >> n;

  vector<int> a(n, 0);
  for (int i = 0; i < n; i++) {
    cin >> a.at(i);
  }

  // Bubble Sort
  int cnt = 0;
  int flag = 1;
  int i = 0;
  while (flag) {
    flag = 0;
    for (int j = n - 1; j > i; j--) {
      if (a.at(j) < a.at(j - 1)) {
        int tmp = a.at(j);
        a.at(j) = a.at(j - 1);
        a.at(j-1) = tmp;
        flag = 1;
        cnt++;
      }
    }
    i++;
  }

  // Output
  for (int i = 0; i < n; i++) {
    if (i != 0) {
      cout << ' ';
    }
    cout << a.at(i);
  }
  cout << endl;
  cout << cnt << endl;

  return 0;
}
