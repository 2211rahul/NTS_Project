import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "../components/Home/Home";
import SignIn from "../pages/User/SignIn/SignIn";
import SignUp from "../pages/User/SignUp/SignUp";
import ContactUs from "../pages/HomePage/ContactUs";
import AboutUs from "../pages/HomePage/AboutUs";

import ErrorPage from "../pages/ErrorPages/Error404";



const Router = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route
                    path="/"
                    element={<Home />}>
                </Route>
                <Route
                    path="/signin"
                    element={<SignIn />}>
                </Route>
                <Route
                    path="/signup"
                    element={<SignUp />}>
                </Route>
             
                <Route
                    exact path="/contact"
                    element={<ContactUs />}>
                </Route>
                <Route
                    exact path="/about"
                    element={<AboutUs />} />
                
                <Route path="*" element={<ErrorPage />} />
            </Routes>

        </BrowserRouter>
    )
}


export default Router;