import React from "react";
import Featured from "../../pages/HomePage/featured/Featured";
import HomeNavbar from "../Header/HomeNavBar";
import FeaturedProperties from '../../pages/HomePage/featuredProperties/FeaturedProperties';

// import HomeMain from "../../pages/HomePage/HomeMain";
import "./home.css";
import AboutUsCards from "../../pages/HomePage/AboutUsCards";
// import { Button, Form } from "react-bootstrap";

const Home = () => {
  
  return (
    <>
      <HomeNavbar />
      
      <Featured></Featured>
      <br />
      <FeaturedProperties></FeaturedProperties>
      <br/>
      <hr/>
      <h3 style={{textAlign:"center", color:""}}>About Us</h3>
      <AboutUsCards/>
      <br />
      
    </>
  );
}



export default Home;