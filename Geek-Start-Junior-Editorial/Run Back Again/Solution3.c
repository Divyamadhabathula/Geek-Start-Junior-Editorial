#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int a[1000];
    int n,flag=0,temp=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]<=0)
        {
            flag++;
        }
    }
    if(flag>0)
    {
        printf("%d",flag);
    }
    else{
        printf("%d",temp);
    }
    return 0;
}
