import HomeNavbar from "../../components/Header/HomeNavBar";
import "./contactus.css";
const ContactUs = () => {
  return (
      <>
         <HomeNavbar/>
         <div className="container">
         <h2 className="common-heading" style={{marginBottom:"3rem"}}>Feel Free To Contact Us</h2>
         <iframe 
            title="urbanstay"
            src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15129.898445869465!2d73.9485287!3d18.5526296!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2c3c4e6d47d57%3A0x1498d250fd70ddd8!2sWorld%20Trade%20Center%20Pune!5e0!3m2!1sen!2sin!4v1689155045977!5m2!1sen!2sin" 
            width="90%" height="450" 
            style={{border:0}} allowFullScreen="" 
            loading="lazy" 
            referrerpolicy="no-referrer-when-downgrade">
         </iframe>
         </div>
         <div className="container">
            <div className="contact-form">
               {/* Used https://formspree.io/  for mail connection*/}
               <form 
                  action="https://formspree.io/f/xpzerewr" 
                  method="POST" 
                  className="contactInputs"
               >
                  <input 
                     type="text" 
                     name="username" 
                     placeholder="username" 
                     autoComplete="off"
                     className="inputStyle"
                     required
                     />

                  <input 
                     type="email" 
                     name="Email" 
                     placeholder="Email" 
                     autoComplete="off"
                     className="inputStyle"
                     required
                  />

                  <textarea 
                     name="message" 
                     cols="30" 
                     rows="5" 
                     autoComplete="off" 
                     className="inputStyle"
                     required
                  >
                  </textarea>
                  <input type="submit" value="send" className="submitStyle"/>
               </form>
            </div>
         </div>

      </>
    );
}

export default ContactUs;


