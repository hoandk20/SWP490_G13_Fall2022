import React from 'react';
import { Carousel } from 'antd';
import ImageSlider1 from "../../../assets/image-app/slider1.jpg"
import ImageSlider2 from "../../../assets/image-app/slider2.jpg"
import ImageSlider3 from "../../../assets/image-app/slider3.jpg"
import ImageSlider4 from "../../../assets/image-app/slider4.jpg"
const contentStyle = {
  height: '80vh',
  color: '#fff',
  lineHeight: '160px',
  textAlign: 'center',
  background: '#364d79',
};
const CarouselHome = () => (
  <Carousel autoplay>
    <div>
    <a href="#"> <img className='image-app-1' height={"500vh"} width={"100%"} src={ImageSlider4} alt="app store" /></a>
    </div>
    <div>
    <a href="#"> <img className='image-app-1' height={"500vh"} width={"100%"}  src={ImageSlider2} alt="app store" /></a>
    </div>
    <div>
    <a href="#"> <img className='image-app-1' height={"500vh"} width={"100%"} src={ImageSlider3} alt="app store" /></a>
    </div>
    <div>
    <a href="#"> <img className='image-app-1' height={"500vh"} width={"100%"} src={ImageSlider1} alt="app store" /></a>
    </div>
  </Carousel>
);
export default CarouselHome;