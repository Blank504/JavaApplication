x=[-2:0.01:4];
y=3*x.^3-26*2+6;
y1=9*x.^2-26;
y2=18*x;
plot(x,y,'-r');
hold on
plot(x,y1,'--------k');
hold on
plot(x,y2,':::k');
hold off