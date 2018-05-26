import React, {Component} from 'react'
import CSSModules from 'react-css-modules'
import styles from './modal.css'
import classNames from 'classnames'

@CSSModules(styles, {allowMultiple:true})
export default class Modal extends Component {

    constructor(props) {
        super();
        this.state ={
            show: false
        }
    }

    render() {
        let modal = document.getElementById('myModal');
          return (
            <div>
                <button onClick={() => this.setState({ show: true})} id="myBtn">Open Modal</button>
                <div id="myModal" styleName="modal show">
                    <div  styleName="modal-content">
                        Modal
                    </div>
                </div>
            </div>
        )
    }
}




