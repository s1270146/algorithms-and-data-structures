#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int n;
  cin >> n;
  vector<int> a(n, 0);
  for (int i = 0; i < n; i++) {
    cin >> a.at(i);
  }

  for (int l = 0; l < n; l++) {
    if (l != 0)
      cout << " ";
    cout << a.at(l);
  }
  cout << endl;

  for (int i = 1; i < n; i++) {
    int v = a.at(i);
    int j = i - 1;
    while (j > -1 && a.at(j) > v) {
      a.at(j + 1) = a.at(j);
      j--;
    }
    a.at(j + 1) = v;
    for (int l = 0; l < n; l++) {
      if (l != 0)
        cout << " ";
      cout << a.at(l);
    }
    cout << endl;
  }

  return 0;
}
