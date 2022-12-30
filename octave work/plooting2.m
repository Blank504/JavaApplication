x=[-2*pi:0.01:2*pi]
y=sin(x);
plot(x,y,'^r');
hold on 
y1=cos(x);
plot(x,y,'-b');
hold on
y2=tan(x);
plot(x,y,'---k');
hold off
